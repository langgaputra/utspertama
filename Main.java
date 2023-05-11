import pengguna.*;

class Main {
    public static void main(String[] args) {
        Mhs mhs = new Mhs("username","password");

        mhs.setNama(" Langga Putra R.S");
        mhs.setNim("G.111.20.0044");
        mhs.setSmt(6);
        
        System.out.println("Nama    :" + mhs.getNama());
        System.out.println("Nim    :" + mhs.getNim());
        System.out.println("Smt    :" + mhs.getSmt());
        System.out.println("Username   :" + mhs.getUsername());
        System.out.println("Password  :" + mhs.getPassword());


    }
}