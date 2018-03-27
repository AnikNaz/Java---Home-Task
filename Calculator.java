
public class Calculator {
    private float resalt;

    public void add (float... params) {
        for (Float param: params) {
            this.resalt += param;
        }
    }

    public void minus (float... params) {
        this.resalt = params [0] - params [1];
    }

    public void multiplication (float... params) {
        this.resalt = 1;
        for (Float param: params) {
            this.resalt *= param;
        }
    }

    public void division (float... params) {
        this.resalt = params [0] / params[1];
    }



    public float getResult() {
        return this.resalt;
    }


    public void cleanResalt() {
        this.resalt = 0;
    }

}



