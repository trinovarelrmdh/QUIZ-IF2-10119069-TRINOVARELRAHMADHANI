/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119069.trinovarelrahmadhani;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 */
public class Customer extends ServicePrice implements ServiceItem {
    String name, email;
    boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }
    
    public String currentTime() {
        Date tanggal = new Date();
        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        System.out.println("Date Transaction : " + format.format(tanggal));
    }
}
