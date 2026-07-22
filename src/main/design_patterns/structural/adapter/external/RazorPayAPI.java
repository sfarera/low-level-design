package design_patterns.structural.adapter.external;

//SDK
// Step 0 : External API
public class RazorPayAPI {

    public void pay(Long id, String name, String email, Double amount){
        System.out.println("Razor Pay Payment");
    }
    public RazorPayStatus checkStatus(Long id){
        return RazorPayStatus.OK;
    }
}
