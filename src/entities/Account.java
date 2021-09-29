package entities;

public class Account {
    private int numberOfBorrowedBooks;
    private int numberOfReturnedBooks;
    private int numberOfLostBooks;
    private int numberOfReservedBooks;
    private double fineAmount;

    public Account(int numberOfBorrowedBooks, int numberOfReturnedBooks, int numberOfLostBooks, int numberOfReservedBooks, double fineAmount) {
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
        this.numberOfReturnedBooks = numberOfReturnedBooks;
        this.numberOfLostBooks = numberOfLostBooks;
        this.numberOfReservedBooks = numberOfReservedBooks;
        this.fineAmount = fineAmount;
    }

    public int getNumberOfBorrowedBooks() {
        return numberOfBorrowedBooks;
    }

    public void setNumberOfBorrowedBooks(int numberOfBorrowedBooks) {
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
    }

    public int getNumberOfReturnedBooks() {
        return numberOfReturnedBooks;
    }

    public void setNumberOfReturnedBooks(int numberOfReturnedBooks) {
        this.numberOfReturnedBooks = numberOfReturnedBooks;
    }

    public int getNumberOfLostBooks() {
        return numberOfLostBooks;
    }

    public void setNumberOfLostBooks(int numberOfLostBooks) {
        this.numberOfLostBooks = numberOfLostBooks;
    }

    public int getNumberOfReservedBooks() {
        return numberOfReservedBooks;
    }

    public void setNumberOfReservedBooks(int numberOfReservedBooks) {
        this.numberOfReservedBooks = numberOfReservedBooks;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }
}
