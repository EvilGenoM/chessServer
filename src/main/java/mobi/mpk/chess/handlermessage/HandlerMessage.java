package mobi.mpk.chess.handlermessage;

import mobi.mpk.chess.message.Message;
import mobi.mpk.chess.message.reply.Reply;

public interface HandlerMessage {

    Reply handleMessage(Message message);

}
