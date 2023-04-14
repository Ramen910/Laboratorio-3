
package Logic;
/*b) Defina una clase llamada “Cliente” con los siguientes atributos: cédula, nombre, teléfono y
dirección (5pts)*/
public class Client {
    private String dni;
    private String name;
    private String phone;
    private String address;

    public Client(String dni, String name, String phone, String address) {
        this.dni = dni;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }//end client

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" + "dni=" + dni + ", name=" + name + ", phone=" + phone + ", address=" + address + '}';
    }
    
    
}//end class client
