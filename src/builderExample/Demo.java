package builderExample;

public class Demo {
    public static void main(String[] args) {
//        URL url = new URL();
//        url.setProtocol("https://");
//        url.setHostName("myapp");
//        url.setPort(":8080/");
//        url.setPathParam("homepage/");
//        url.setQueryParam("random");
//
//        System.out.print(url.getProtocol());
//        System.out.print(url.getHostName());
//        System.out.print(url.getPort());
//        System.out.print(url.getPathParam());
//        System.out.print(url.getQueryParam());


        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("https://").hostName("myapp").port(":8080/").pathParam("homepage/").queryParam("random");
        URLBuilder urlBuilder = builder.build();
        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostName);
        System.out.print(urlBuilder.port);
        System.out.print(urlBuilder.pathParam);
        System.out.print(urlBuilder.queryParam);
    }
}