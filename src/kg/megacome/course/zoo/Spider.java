package kg.megacome.course.zoo;

import kg.megacome.course.enums.EnumsType;
import kg.megacome.course.enums.Gender;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Spider extends  Animals {
    private EnumsType spidersT;
    private Gender spiderG;




    public EnumsType getSpidersT() {
        return spidersT;
    }

    public void setSpidersT(EnumsType spidersT) {
        this.spidersT = spidersT;
    }

    public Gender getSpiderG() {
        return spiderG;
    }

    public void setSpiderG(Gender spiderG) {
        this.spiderG = spiderG;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spider spider = (Spider) o;
        return spidersT == spider.spidersT && spiderG == spider.spiderG;
    }

    @Override
    public int hashCode() {
        return Objects.hash(spidersT, spiderG);
    }

    public Spider(String breedName, String nickName, int age, int price, boolean isAgressive, boolean isObey,
                  boolean isVaccinated, LocalDate dateOfBirth, boolean hasBcertificate, EnumsType spidersT,
                  Gender spiderG) {
        super(breedName, nickName, age, price, isAgressive, isObey, isVaccinated, dateOfBirth, hasBcertificate);
        this.spidersT = spidersT;
        this.spiderG = spiderG;

    }


}
