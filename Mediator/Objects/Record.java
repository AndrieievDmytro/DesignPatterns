package Objects;

public class Record {
    private String record;

    public Record(String record){
        this.record = record;
    }

    public String getRecord(){
        return this.record;
    }

    @Override
    public String toString() {
        return this.record;
    }
}
