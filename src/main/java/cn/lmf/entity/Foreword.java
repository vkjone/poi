package cn.lmf.entity;

import java.util.List;

public class Foreword {
    String purpose;
    String reference;
    List<NounExplain> nounExplains;

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public List<NounExplain> getNounExplains() {
        return nounExplains;
    }

    public void setNounExplains(List<NounExplain> nounExplains) {
        this.nounExplains = nounExplains;
    }

    static class NounExplain {
        String noun;
        String explain;

        public String getNoun() {
            return noun;
        }

        public void setNoun(String noun) {
            this.noun = noun;
        }

        public String getExplain() {
            return explain;
        }

        public void setExplain(String explain) {
            this.explain = explain;
        }
    }
}
