package com.p2p;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.p2p.domain.Borrower;
import com.p2p.service.LoanService;

public class LoanServiceTest {

    private static final Logger logger = LogManager.getLogger(LoanServiceTest.class);

    // TC-01
    @Test
    void shouldRejectLoanWhenBorrowerNotVerified() {
        logger.info("TC-01 START: Borrower tidak terverifikasi");

        Borrower borrower = new Borrower(false, 700);
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.valueOf(1000);

        logger.debug("Borrower verified: {}", false);
        logger.debug("Amount: {}", amount);

        var illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            logger.info("Executing createLoan()");
            loanService.createLoan(borrower, amount);
        });

        logger.info("TC-01 END: Passed (exception thrown)");
    }

    // TC-02
    @Test
    void shouldRejectLoanWhenAmountIsZeroOrNegative() {
        logger.info("TC-02 START: Amount tidak valid");

        Borrower borrower = new Borrower(true, 700);
        LoanService loanService = new LoanService();

        BigDecimal zeroAmount = BigDecimal.ZERO;
        BigDecimal negativeAmount = BigDecimal.valueOf(-100);

        logger.debug("Testing zero amount: {}", zeroAmount);
        assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(borrower, zeroAmount);
        });

        logger.debug("Testing negative amount: {}", negativeAmount);
        var negativeAmountException = assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(borrower, negativeAmount);
        });

        logger.info("TC-02 END: Passed (invalid amounts rejected)");
    }

    // TC-03
    @Test
    void shouldApproveLoanWhenCreditScoreHigh() {
        logger.info("TC-03 START: Credit score tinggi");

        Borrower borrower = new Borrower(true, 700);
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.valueOf(1000);

        logger.debug("Borrower score: {}", 700);
        logger.debug("Amount: {}", amount);

        var loan = loanService.createLoan(borrower, amount);

        logger.info("Loan status: {}", loan.getStatus());

        assert (loan.getStatus() == com.p2p.domain.Loan.Status.APPROVED);

        logger.info("TC-03 END: Passed (loan approved)");
    }

    // TC-04
    @Test
    void shouldRejectLoanWhenCreditScoreLow() {
        logger.info("TC-04 START: Credit score rendah");

        Borrower borrower = new Borrower(true, 500);
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.valueOf(1000);

        logger.debug("Borrower score: {}", 500);
        logger.debug("Amount: {}", amount);

        var loan = loanService.createLoan(borrower, amount);

        logger.info("Loan status: {}", loan.getStatus());

        assert (loan.getStatus() == com.p2p.domain.Loan.Status.REJECTED);

        logger.info("TC-04 END: Passed (loan rejected)");
    }
}