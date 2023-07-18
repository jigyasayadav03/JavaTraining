/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 *
 * @author jigyasa_yadav
 */
class Producer extends Thread {

    OutputStream os;

    public Producer(OutputStream o) {
        os = o;
    }

    public void run() {
        int count = 1;

        while (count < 100) {
            try {
                os.write(count);
                os.flush();

                System.out.println("Producer " + count);
                System.out.flush();

                Thread.sleep(10);
                count++;
            } catch (Exception e) {
            }
        }
    }
}

class Consumer extends Thread {

    InputStream is;

    public Consumer(InputStream i) {

        is = i;
    }

    @Override
    public void run() {
        int x = 1;

        while (x < 100) {
            try {

                x = is.read();

                System.out.println("Consumer " + x);
                System.out.flush();
                Thread.sleep(10);

            } catch (Exception e) {
            }
        }
    }

}

public class PipedStreamsPrc1 {

    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();

        pos.connect(pis);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        p.start();
        c.start();
    }

}
