package cmd;

public enum instance {
    CMD("http://sapp-dev-06.ell.fnt.de:1040/html");

    private String inst;

    instance(String inst){
        this.inst = inst;
    }

    @Override
    public String toString() {
        return inst;
    }
}
