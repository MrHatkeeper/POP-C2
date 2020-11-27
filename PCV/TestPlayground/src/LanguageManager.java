public enum LanguageManager {
    INSTANCE;

    private Language language;


    public void changeLanguage(){
        String langChange = InputController.INSTANCE.getAdvancedInput();
        if(langChange.equals("english")){
            System.out.println("En");
            this.language = Language.ENGLISH;
        }
        else{
            System.out.println("CZ");
            this.language = Language.CESTINA;
        }
    }



}
