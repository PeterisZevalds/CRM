package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customers")
public class Customer implements Serializable  {

    @Id
    @Column (name = "customerId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Address")
    private String address;

    @Column(name = "RegistrationNumber")
    private int regNumber;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "email")
    private String mail;

    @Column(name = "WebPage")
    private String webPage;

    @Column(name = "ContactPerson")
    private String contactPerson;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", regNumber=" + regNumber +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", webPage='" + webPage + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                '}';
    }
}
