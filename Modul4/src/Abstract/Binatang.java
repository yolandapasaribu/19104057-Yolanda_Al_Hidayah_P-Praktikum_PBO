package Abstract;

//class abstrak
public abstract class Binatang {
    //jenis binatang apa aja
    private String jenis;

    public Binatang(String jenis) {
        this.jenis = jenis;
    }

    //method abstrak
    protected abstract void suara();

    //mengoverride class string
    @Override
    public String toString() {
        return "Seekor " + jenis;
    }
}
