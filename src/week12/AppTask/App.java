package week12.AppTask;

public class App {

    String name;
    double version;

    public App( double version) {
        this.name = getClass().getSimpleName();
        this.version = version;
    }
    public void download(){
        System.out.println(name +  " is downloading " + version);
    }
}
/*
 Create an App class

        - create variables:
            name (app name), version

        - create a constructor to initialize the variables

        - create method:
            download()
                Example output: prints $name is downloading version $version

    Create a class Instagram

        - Instagram class inherits App class

        - create a constructor to call the parent constructor and set up variables (name and version)

        - create method:
            postPicture()
                Example output: prints Posting picture to Instagram

    Create a class Youtube

        - Youtube class inherits App class

        - create a constructor to call the parent constructor and set up variables (name and version)

        - create method:
            watchVideo()
                Example output: prints Watching java tutorial

 */