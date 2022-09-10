package ru.max.naivepatterns.gof.behavioral.Iterator;

public class TopicList implements NaiveList<Topic>
{
    private Topic[] topics;

    public TopicList(Topic[] topics)
    {
        this.topics = topics;
    }

    @Override
    public NaiveIterator<Topic> iterator() {
        return new TopicIterator(topics);
    }
}
