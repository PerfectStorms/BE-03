package task2;

public class Person implements Runnable {
    private final Mail mail;

    public Person(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        // do something here
        mail.setText("Person [" + name + "] wrote an email 'AAA'");
    }
}
