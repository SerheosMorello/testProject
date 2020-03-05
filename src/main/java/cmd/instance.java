package cmd;

public enum instance {
    CMD("http://sapp-dev-fe-01.ell.fnt.de/command/next");

    private String inst;

    instance(String inst){
        this.inst = inst;
    }

    @Override
    public String toString() {
        return inst;
    }
}
