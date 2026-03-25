public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method

    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int time) {
        return expectedMinutesInOven() - time;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int layer) {
        return layer * 2;
    }

    public int totalTimeInMinutes(int layer, int minutes) {
        return remainingMinutesInOven(minutes) + preparationTimeInMinutes(layer);
    }

    // TODO: define the 'totalTimeInMinutes()' method

}
