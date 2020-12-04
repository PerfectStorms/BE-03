package task2;

/* 
Output example :
Thread-0 MailServer received: [Person [Thread-1] wrote an email 'AAA'] in 1001 ms after start
*/

public class Solution {
    public static void main(String[] args) {
        Mail mail = new Mail();
        Thread server = new Thread(new MailServer(mail));
        Thread person = new Thread(new Person(mail));

        server.start();
        person.start();
    }
}
