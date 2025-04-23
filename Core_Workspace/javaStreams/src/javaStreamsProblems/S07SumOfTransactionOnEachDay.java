package javaStreamsProblems;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    private Date date;
    private Integer amount;

    public Transaction(String date, Integer amount) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.date = sdf.parse(date);
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public Integer getAmount() {
        return amount;
    }

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", amount=" + amount + "]";
	}
}

public class S07SumOfTransactionOnEachDay {
	public static void main(String[] args) throws ParseException {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction("2022-01-01", 100),
			    new Transaction("2022-01-01", 200),
			    new Transaction("2022-01-02", 300),
			    new Transaction("2022-01-02", 400),
			    new Transaction("2022-01-03", 500)
			);
		
		Map<Date, Integer> dailyTransaction = transactions.stream()
														  .collect(Collectors.groupingBy(
																  						Transaction::getDate, 
																  						Collectors.summingInt(Transaction::getAmount)));
		
		
		dailyTransaction.forEach((date,amount)->System.out.println("Date: " + date +" \n" + "Amount: " + amount + " \n" ));
	}
}
