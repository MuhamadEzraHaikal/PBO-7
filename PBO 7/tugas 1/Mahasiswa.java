public class Mahasiswa<O, P, Q> {
    private O nim;
    private P name;
    private Q kelas;

    public void setNim(O nim) {
        this.nim = nim;
    }

    public void setName(P name) {
        this.name = name;
    }

    public void setClass(Q kelas) {
        this.kelas = kelas;
    }

    // Getter methods
    public O getNim() {
        return nim;
    }

    public P getName() {
        return name;
    }

    public Q getClassInfo() {
        return kelas;
    }
}