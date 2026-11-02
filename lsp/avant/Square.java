package inf4067.solid.lsp.avant;

// Diapo 35 : viole le LSP (change le comportement attendu des setters)
public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
