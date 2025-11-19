package genericos;

public class Garzon implements Atendible, Comparable<Garzon> {
    private int tiempo;

    public Garzon(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void Atender() {

    }


    @Override
    public int compareTo(Garzon o) {
        return this.tiempo - o.tiempo;
    }
}

