package app;

import interface_adapter.PlaceholderViewModel;
import view.PlaceholderView;

public class Main {

    public static void main(String[] args)
    {
        EntityMemory runTimeUser = new EntityMemory();
        PlaceholderViewModel placeHolderViewModel = new PlaceholderViewModel();
        PlaceholderView placeHolderView = new PlaceholderView(placeHolderViewModel);
    }
}
