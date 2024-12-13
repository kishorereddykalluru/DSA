package com.dsa.multidimensionalarray;

public class DeliverPosts {

    public static void main(String[] args) {

        // two  for loops

        int [][] deliverPosts= {{1,1,0,1},
                                {1,1,0,1},
                                {0,0,1,0},
                                {0,0,1,1}};

        DeliverPosts deliverPosts1 = new DeliverPosts();
        int days = deliverPosts1.deliverPosts(deliverPosts);
        System.out.println(days);
    }

    // postman will deliver daily in one street
    // they are not separated by water body
    // houses and water bodies
    // 3 - days

    public int deliverPosts(int[][] area) {

        if(area==null || area.length == 0 || area[0].length == 0) return 0;

        int days = 0;
        for(int i = 0; i < area.length; i++) {
            for(int j = 0; j < area[0].length;j++) {
                if(area[i][j] == 0){
                    days += 1;
                }
            }
        }
        return days;
    }

}
