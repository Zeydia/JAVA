public class Heritage {
    public class Horse
    {
        protected String mName;
        protected int mX;
        protected int mY;

        public Horse(String name)
        {
            this.mName = name;
            this.mX = 200;
            this.mY = 200;
        }

        public void move(int x, int y)
        {
            this.mX = x;
            this.mY = y;
            System.out.println("Deplacement a "+this.mX+" et "+this.mY);
        }
    }

    public class Pegasus extends Horse
    {
        private int mZ;

        public Pegasus(String name)
        {
            super(name);
            this.mZ = 1000;
        }

        public void Vole(int z)
        {
            this.mZ = z;
            System.out.println(this.mZ);
        }
    }

    public static void main(String[] args) {
        
        // Horse h1 = new Horse("cheval1");
        // h1.move(167, 400);

        // Pegasus p = new Pegasus("paga");
        // p.move(199, 300);
        // p.Vole(3000);
        
    }
}
