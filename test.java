class test{
    public static void main(String[] args) {
        int rc=0;
        for(int i=1;i<=10;i++){
            rc=i;
            for(int j=1;j<=10;j++){
                System.out.print(rc+" ");
                rc=rc+10;
            }
            System.out.println();
        }
    }
}