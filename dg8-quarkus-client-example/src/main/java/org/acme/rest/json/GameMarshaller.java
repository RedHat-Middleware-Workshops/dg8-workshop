package org.acme.rest.json;

import java.io.IOException;

import org.infinispan.protostream.MessageMarshaller;

public class GameMarshaller implements MessageMarshaller<Game>{

    @Override
    public Game readFrom(MessageMarshaller.ProtoStreamReader reader) throws IOException {
        String name = reader.readString("name");
        String description = reader.readString("description");
        return new Game(name, description);
    }

    @Override
    public void writeTo(MessageMarshaller.ProtoStreamWriter writer, Game game) throws IOException {
        writer.writeString("name", game.getName());
        writer.writeString("description", game.getDescription());
    }

    @Override
    public Class<? extends Game> getJavaClass() {
        return Game.class;
    }

    @Override
    public String getTypeName() {
        return "quickstart.Game";
    }

}
