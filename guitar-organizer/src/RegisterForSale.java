import javax.imageio.stream.ImageInputStream;

public class RegisterForSale {

    private final GuitarRepository guitarRepository;

    public RegisterForSale(GuitarRepository guitarRepository) {
        this.guitarRepository = guitarRepository;
    }

    public static void main(String[] args) {
        RegisterForSale registerForSale = new RegisterForSale();
    }
}

