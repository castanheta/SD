public class FIFOchar {
    private int inPnt, outPnt;
    private char[] fifo;
    private boolean empty;
    public FIFOchar(int nElem){
        fifo = new char[nElem];
        inPnt = outPnt = 0;
        empty = true;
    }

    public void in(char val){
        if((inPnt != outPnt) || empty){
            fifo[inPnt] = val;
            inPnt = (inPnt + 1) % fifo.length;
            empty = false;
        }
    }

    public char out(){
        char val = 0;
        if(!empty){
            val = fifo[outPnt];
            outPnt = (outPnt + 1) % fifo.length;
            empty = (inPnt == outPnt);
        }
        return val;
    }
}
