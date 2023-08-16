package patterns.structural_patterns.adapter;

public interface SocketAdapter {
    public Volt getVolt120();
    public Volt getVolt12();
    public Volt getVolt3();
}
