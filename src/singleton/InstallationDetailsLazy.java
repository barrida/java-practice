package singleton;

public final class InstallationDetailsLazy {

    private static InstallationDetailsLazy INSTANCE = null;

    private long licenseNumber;

	public long getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(long licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
    public static InstallationDetailsLazy getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new InstallationDetailsLazy();
        }
        return INSTANCE;
    }
    
    public static void main(String[] args){
        InstallationDetailsLazy obj1 = InstallationDetailsLazy.getInstance();
        InstallationDetailsLazy obj2 = InstallationDetailsLazy.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        assert(obj1 == obj2);
        assert(obj1.getLicenseNumber() == obj2.getLicenseNumber());
        System.out.println("InstallationDetailsLazy is really a singleton!");
        System.out.println("Your software license number: " + obj1.getLicenseNumber());
    }


}
