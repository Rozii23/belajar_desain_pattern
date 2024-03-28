class Main{
    public static void main(String[]args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelduck = new ModelDuck();
        modelduck.performFly(); // Akan memanggil constructor modelduck(FlyNoWay())
        modelduck.setFlyBehavior(new FlyWithRocketPower());
        modelduck.performFly();

        // Membuat objek konteks
        System.out.println("- - - - - - - - - -");
        Konteks konteks = new Konteks();

        // Operasi penjumlahan
        OperasiMatematika penjumlahan = new Penjumlahan();
        konteks.setOperasi(penjumlahan);
        System.out.println("Penjumlahan: " + konteks.lakukanOperasi(15, 25));

        // Operasi pengurangan
        OperasiMatematika pengurangan = new Pengurangan();
        konteks.setOperasi(pengurangan);
        System.out.println("Pengurangan: " + konteks.lakukanOperasi(13, 6));
    }
}
