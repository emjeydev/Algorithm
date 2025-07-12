package Models;

import java.util.Date;

public class BorrowingHistory {
    public String borrowerId;
    public String borrowedDate;
    public Boolean isReturned;

    public BorrowingHistory(String borrowerId, String borrowedDate) {
        this.borrowerId = borrowerId;
        this.borrowedDate = borrowedDate;
    }
}
