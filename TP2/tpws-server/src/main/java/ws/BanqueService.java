package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double Conversion(double mt){
        return mt * 11;
    }

    @WebMethod
    public Compte getCompte(int code){
        return new Compte(code, Math.random() * 10000, new Date());
    }

    @WebMethod
    public List<Compte> listCopmtes(){
        return List.of(
         new Compte(1, Math.random() * 10000, new Date()),
         new Compte(2, Math.random() * 10000, new Date()),
         new Compte(3, Math.random() * 10000, new Date())
        );
    }
}
