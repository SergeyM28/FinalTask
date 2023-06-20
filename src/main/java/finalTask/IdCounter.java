package finalTask;

import java.io.IOException;

public class IdCounter implements AutoCloseable{
    private int id;

    public Integer getNewId (){
        this.id += 1;
        return this.id;
    }

    public IdCounter(int id) {
        this.id = id;

    }

    public IdCounter() {
        this.id = 0;
    }

    @Override
    public void close() throws IOException {
    }
}
