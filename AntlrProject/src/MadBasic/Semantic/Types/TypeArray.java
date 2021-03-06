package MadBasic.Semantic.Types;

/**
 * Created by ahinojosa on 6/04/16.
 */
//    INT(0), FLOAT(1), STRING(2), BOOL(3), LIST(4), OBJECT(5), FALSE(-1);

public class TypeArray extends Type {
    private Type type;
    private Array array;

    public TypeArray() {
        value = 4;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(int start, int end) {
        this.array = new Array(start, end);
    }

    @Override
    public boolean equals(Type type) {
        return super.equals(type) &&
                this.type.equals(((TypeArray) type).getType()) &&
                this.array.getDepth() == ((TypeArray) type).getArray().getDepth();
    }

    @Override
    public String toString() {
        return type.toString() +
                array.toString();
    }

    public class Array {
        int start;
        int end;
        Array array;
        int m;
        int k;

        public Array(int start, int end) {
            this.start = start;
            this.end = end;
            m = 1;
            k = start;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public Array getArray() {
            return array;
        }

        public Array getArray(int n) {
            if(n <= 0) {
                return this;
            }else{
                return array.getArray(n-1);
            }
        }

        public void setArray(Array array) {
            if (this.array == null) {
                this.array = array;
            } else {
                this.array.setArray(array);
            }
            m = this.array.getSize();
            k = this.start * this.m + this.array.getK();
        }

        public int getDepth(){
            if (array == null){
                return 1;
            }
            else {
                return 1 + array.getDepth();
            }
        }

        public int getSize(){
            int size = end - start + 1;
            if(this.array != null){
                size *= this.array.getSize();
            }
            return  size;
        }

        public int getDim(){
            return end - start + 1;
        }

        public int getM() {
            return m;
        }

        public void setM(int m) {
            this.m = m;
        }

        public int getK() {
            return k;
        }

        public void setK(int k) {
            this.k = k;
        }

        @Override
        public String toString() {
            String sArray = "";
            if (array != null){
                sArray = array.toString();
            }

            return "[" +
                    "" + start +
                    "," + end +
                    "]" + sArray;
        }
    }
}