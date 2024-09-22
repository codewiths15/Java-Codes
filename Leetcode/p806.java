public class p806 {

    static void numberOfLines(int[] widths, String s) {
        int row=1, pixels=0;
        int[] result = new int[2];
        int i=0;
        while(i<s.length()){
            pixels+=widths[s.charAt(i)-'a'];
            i++;
            if(pixels>100){
                System.out.println(pixels);
                i--;
                pixels-=widths[s.charAt(i)-'a'];
                row++;
                pixels=0;
            }       
         
        }

        result[0]=row;
        result[1]=pixels;
    System.out.println(result[0]+" "+result[1]);
    }
    public static void main(String[] args) {
        
        int[] width = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s="bbbcccdddaaa";
        numberOfLines(width,s);
    }
}
