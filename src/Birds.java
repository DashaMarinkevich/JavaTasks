
    public  class Birds{
        int count;
        String kind;

        @Override
        public String toString() {
            return "Birds{" +
                    "count=" + count +
                    ", kind='" + kind + '\'' +
                    '}';
        }

        public Birds(String kind){
            this.kind = kind;
        }
        public Birds(int count, String kind) {
            this.count = count;
            this.kind = kind;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }
    }

