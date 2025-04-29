import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.ArrayList;

public class E {

    // ArrayList to store books
    static ArrayList<Book> bookList = new ArrayList<>();
    static ArrayList<Book> issuedBooks = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("📚 Library Management System");
        frame.setSize(800, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels for Book Details
        JLabel titleLabel = new JLabel("Title:");
        titleLabel.setBounds(50, 30, 100, 30);
        frame.add(titleLabel);

        JTextField titleField = new JTextField();
        titleField.setBounds(150, 30, 200, 30);
        frame.add(titleField);

        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(50, 70, 100, 30);
        frame.add(authorLabel);

        JTextField authorField = new JTextField();
        authorField.setBounds(150, 70, 200, 30);
        frame.add(authorField);

        JLabel genreLabel = new JLabel("Genre:");
        genreLabel.setBounds(50, 110, 100, 30);
        frame.add(genreLabel);

        JTextField genreField = new JTextField();
        genreField.setBounds(150, 110, 200, 30);
        frame.add(genreField);

        JLabel isbnLabel = new JLabel("ISBN:");
        isbnLabel.setBounds(50, 150, 100, 30);
        frame.add(isbnLabel);

        JTextField isbnField = new JTextField();
        isbnField.setBounds(150, 150, 200, 30);
        frame.add(isbnField);

        JLabel publisherLabel = new JLabel("Publisher:");
        publisherLabel.setBounds(50, 190, 100, 30);
        frame.add(publisherLabel);

        JTextField publisherField = new JTextField();
        publisherField.setBounds(150, 190, 200, 30);
        frame.add(publisherField);

        JLabel imageLabel = new JLabel("Image Path:");
        imageLabel.setBounds(50, 230, 100, 30);
        frame.add(imageLabel);

        JTextField imagePathField = new JTextField();
        imagePathField.setBounds(150, 230, 200, 30);
        frame.add(imagePathField);

        // Buttons
        JButton addButton = new JButton("Add Book");
        addButton.setBounds(50, 270, 150, 50);
        frame.add(addButton);

        JButton viewButton = new JButton("View Books");
        viewButton.setBounds(210, 270, 150, 50);
        frame.add(viewButton);

        JButton issueButton = new JButton("Issue Book");
        issueButton.setBounds(370, 270, 150, 50);
        frame.add(issueButton);

        JButton returnButton = new JButton("Return Book");
        returnButton.setBounds(530, 270, 150, 50);
        frame.add(returnButton);

        JButton deleteButton = new JButton("Delete Book");
        deleteButton.setBounds(50, 340, 150, 50);
        frame.add(deleteButton);

        // Area to display information
        JTextArea infoArea = new JTextArea();
        infoArea.setBounds(50, 410, 600, 150);
        infoArea.setEditable(false);
        frame.add(infoArea);

        // Image label to display book cover image
        JLabel bookImageLabel = new JLabel();
        bookImageLabel.setBounds(550, 30, 200, 200);  // Space for image
        frame.add(bookImageLabel);

        // Button to upload image
        JButton uploadButton = new JButton("Upload Image");
        uploadButton.setBounds(360, 230, 150, 30);
        frame.add(uploadButton);

        // Add Book action
        addButton.addActionListener(e -> {
            String title = titleField.getText().trim();
            String author = authorField.getText().trim();
            String genre = genreField.getText().trim();
            String isbn = isbnField.getText().trim();
            String publisher = publisherField.getText().trim();
            String imagePath = imagePathField.getText().trim();

            if (!title.isEmpty() && !author.isEmpty() && !genre.isEmpty() && !isbn.isEmpty() && !publisher.isEmpty() && !imagePath.isEmpty()) {
                Book newBook = new Book(title, author, genre, isbn, publisher, imagePath);
                bookList.add(newBook);
                JOptionPane.showMessageDialog(frame, "✅ Book added: " + title);
                clearFields(titleField, authorField, genreField, isbnField, publisherField, imagePathField);
            } else {
                JOptionPane.showMessageDialog(frame, "⚠️ All fields must be filled.");
            }
        });

        // View Books action
        viewButton.addActionListener(e -> {
            infoArea.setText("");
            bookImageLabel.setIcon(null);  // Clear image

            if (bookList.isEmpty()) {
                infoArea.append("No books available!\n");
            } else {
                infoArea.append("Available Books:\n");
                for (Book book : bookList) {
                    infoArea.append(book + "\n");

                    // Display the book image for each book
                    ImageIcon icon = new ImageIcon(book.imagePath);
                    Image image = icon.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH); // Resize the image
                    bookImageLabel.setIcon(new ImageIcon(image));
                }
            }
        });

        // Issue Book action
        issueButton.addActionListener(e -> {
            String title = titleField.getText().trim();
            Book bookToIssue = findBookByTitle(title);

            if (bookToIssue != null) {
                issuedBooks.add(bookToIssue);
                bookList.remove(bookToIssue);
                JOptionPane.showMessageDialog(frame, "🎟️ Book issued: " + title);
                clearFields(titleField, authorField, genreField, isbnField, publisherField, imagePathField);
            } else {
                JOptionPane.showMessageDialog(frame, "⚠️ Book not found.");
            }
        });

        // Return Book action
        returnButton.addActionListener(e -> {
            String title = titleField.getText().trim();
            Book bookToReturn = findBookByTitle(title);

            if (bookToReturn != null) {
                bookList.add(bookToReturn);
                issuedBooks.remove(bookToReturn);
                JOptionPane.showMessageDialog(frame, "🔄 Book returned: " + title);
                clearFields(titleField, authorField, genreField, isbnField, publisherField, imagePathField);
            } else {
                JOptionPane.showMessageDialog(frame, "⚠️ Book not found.");
            }
        });

        // Delete Book action
        deleteButton.addActionListener(e -> {
            String title = titleField.getText().trim();
            Book bookToDelete = findBookByTitle(title);

            if (bookToDelete != null) {
                bookList.remove(bookToDelete);
                JOptionPane.showMessageDialog(frame, "🗑️ Book deleted: " + title);
                clearFields(titleField, authorField, genreField, isbnField, publisherField, imagePathField);
            } else {
                JOptionPane.showMessageDialog(frame, "⚠️ Book not found.");
            }
        });

        // Upload Image action
        uploadButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select Book Cover Image");
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "gif"));

            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String imagePath = selectedFile.getAbsolutePath();
                imagePathField.setText(imagePath);
            }
        });

        frame.setVisible(true);
    }

    // Find a book by its title
    private static Book findBookByTitle(String title) {
        for (Book book : bookList) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Clear all text fields
    private static void clearFields(JTextField... fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }
}

class Book {
    String title;
    String author;
    String genre;
    String isbn;
    String publisher;
    String imagePath;  // Path to the book image

    public Book(String title, String author, String genre, String isbn, String publisher, String imagePath) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.publisher = publisher;
        this.imagePath = imagePath;  // Set the image path
    }

    @Override
    public String toString() {
        return title + " by " + author + " | Genre: " + genre + " | ISBN: " + isbn + " | Publisher: " + publisher;
    }
}
