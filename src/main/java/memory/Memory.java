package memory;

public class Memory {

    private Long used;

    private Long max;

    public Memory(long used, long max) {
        this.used = used;
        this.max = max;
    }

    public long getUsed() {
        return used;
    }

    public long getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "Memory{" + "used=" + used + ", max=" + max + "}";
    }

}

