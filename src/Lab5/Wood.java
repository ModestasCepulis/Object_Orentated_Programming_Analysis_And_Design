package Lab5;

public enum Wood {
    ALDER, MAHOGANY, CEDAR;

    public String toString()
    {
        switch(this)
        {
            case ALDER: return "Alder";
            case MAHOGANY: return "Mahogany";
            case CEDAR: return "Cedar";
            default: return "Cedar";
        }
    }

}
