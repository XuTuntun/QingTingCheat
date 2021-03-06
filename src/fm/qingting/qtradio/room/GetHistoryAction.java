package fm.qingting.qtradio.room;

public class GetHistoryAction extends Action
{
  private String connectUrl;
  private int maxHistoryRecord = -1;
  private String roomId;
  private int roomType;

  public GetHistoryAction()
  {
    this.actionType = 9;
  }

  public int getActionType()
  {
    return this.actionType;
  }

  public String getConnectUrl()
  {
    return this.connectUrl;
  }

  public int getRecordCount()
  {
    return this.maxHistoryRecord;
  }

  public String getRoomId()
  {
    return this.roomId;
  }

  public int getRoomType()
  {
    return this.roomType;
  }

  public void setConnectUrl(String paramString1, String paramString2, int paramInt)
  {
    this.connectUrl = paramString1;
    this.roomId = paramString2;
    this.roomType = paramInt;
  }

  public void setRecordCount(int paramInt)
  {
    this.maxHistoryRecord = paramInt;
  }
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     fm.qingting.qtradio.room.GetHistoryAction
 * JD-Core Version:    0.6.2
 */