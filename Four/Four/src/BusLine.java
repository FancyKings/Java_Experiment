import java.util.LinkedList;
import java.util.List;

/**
 * @author Fancyking
 */
public class BusLine {

    /**
     * 这里假设为站点 ID 号， 站点名称的话改为 String
     */
    private int beginPoint, endPoint;
    private List<Human> humanList = new LinkedList<>();

    BusLine(int beginPoint, int endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(int endPoint) {
        this.endPoint = endPoint;
    }

    public int getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(int beginPoint) {
        this.beginPoint = beginPoint;
    }

    int getListSize() {
        return humanList.size();
    }

    void addHuman(Human o) {
        int pos = findPos(o);
        humanList.add(pos, o);
    }

    private int findPos(Human o) {
        Human nowCheck = new Human();
        int insertPos = 0;
        for (Object aHumanList : humanList) {
            nowCheck = (Human) aHumanList;
            if (o.compareTo(nowCheck) <= 0) {
                ++insertPos;
            }
            else {
                return insertPos;
            }
        }
        return insertPos;
    }

    void showAll() {
        for (Human now : humanList) {
            System.out.println(now.toString());
        }
    }
}
