public class Subarrayer {



        public static void main(String args[]){

            int[] nums = {0,1,2,3,4,5};
            Subarrayer object = new Subarrayer();

            object.subItUp(nums);

        }

        public void subItUp(int[] arrayToSub){

            for(int i=0; i < arrayToSub.length; i++){


                for(int j=i; j<arrayToSub.length; j++){

                    for(int k=i; k<=j; k++) {
                        System.out.print(arrayToSub[k]);
                    }
                System.out.println();
                }

            }


        }





}
