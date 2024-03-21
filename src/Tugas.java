// Interface untuk operasi matematika
interface OperasiMatematika {
    int hitung(int a, int b);
}

// Implementasi operasi penjumlahan
class Penjumlahan implements OperasiMatematika {
    @Override
    public int hitung(int a, int b) {
        return a + b;
    }
}

// Implementasi operasi pengurangan
class Pengurangan implements OperasiMatematika {
    @Override
    public int hitung(int a, int b) {
        return a - b;
    }
}

// Kelas yang menggunakan strategi
class Konteks {
    private OperasiMatematika operasi;

    // Setter untuk strategi
    public void setOperasi(OperasiMatematika operasi) {
        this.operasi = operasi;
    }

    // Metode untuk melakukan operasi matematika
    public int lakukanOperasi(int a, int b) {
        return operasi.hitung(a, b);
    }
}