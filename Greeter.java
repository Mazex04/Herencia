class Greeter{


    static String getGreeting(){

        return "Goodbye, mars";
    }

    public static String main(String [] args){


        try {
            return getGreeting();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}