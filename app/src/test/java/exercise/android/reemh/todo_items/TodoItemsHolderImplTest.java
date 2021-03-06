//package exercise.android.reemh.todo_items;
//
//import junit.framework.TestCase;
//
//public class TodoItemsHolderImplTest extends TestCase {
//
//  public void testwhen_addingTodoItem_then_callingListShouldHaveThisItem(){
//    // setup
//    TodoItemsHolderImpl holderUnderTest = new TodoItemsHolderImpl();
//    assertEquals(0, holderUnderTest.getCurrentItems().size());
//
//    // test
//    holderUnderTest.addNewInProgressItem("do shopping");
//
//    // verify
//    assertEquals(1, holderUnderTest.getCurrentItems().size());
//  }
//
//  // TODO: add at least 10 more tests to verify correct behavior of your implementation of `TodoItemsHolderImpl` class
////  delete item
//  public void testwhen_DeletingItem_then_callingListShouldntHaveThisItem(){
//    // setup
//    TodoItemsHolderImpl holderUnderTest = new TodoItemsHolderImpl();
//    holderUnderTest.addNewInProgressItem("do shopping");
//    assertEquals(1, holderUnderTest.getCurrentItems().size());
//
//    holderUnderTest.deleteItem(holderUnderTest.getCurrentItems().get(0));
//    assertEquals(0,holderUnderTest.getCurrentItems().size());
//  }
////  add item and change status
//  public void testwhen_addItem_and_changeStatus_then_thisItemShouldHaveThisStatus(){
//    // setup
//    TodoItemsHolderImpl holderUnderTest = new TodoItemsHolderImpl();
//    holderUnderTest.addNewInProgressItem("fix_lamp");
//    assertEquals(2,holderUnderTest.getCurrentItems().get(0).status);
//
//    holderUnderTest.markItemDone(holderUnderTest.getCurrentItems().get(0));
//    assertEquals(1,holderUnderTest.getCurrentItems().get(0).status);
//}
////  add few items
//  public void testwhen_addingSeveralItems_then_toDoItemsListShouldHaveTheseItems(){
//    // setup
//    TodoItemsHolderImpl holderUnderTest = new TodoItemsHolderImpl();
//    holderUnderTest.addNewInProgressItem("fix_lamp");
//    holderUnderTest.addNewInProgressItem("go_to_bank");
//    holderUnderTest.addNewInProgressItem("do_ex5");
//    assertEquals(3,holderUnderTest.getCurrentItems().size());
//}
////   mark done and than inprogress
//  public void testwhen_markingItemAsDoneandThanInProgress_then_StatusChanges(){
//    // setup
//    TodoItemsHolderImpl holderUnderTest = new TodoItemsHolderImpl();
//    holderUnderTest.addNewInProgressItem("do_ex5");
//    holderUnderTest.markItemDone(holderUnderTest.getCurrentItems().get(0));
//    assertEquals(1,holderUnderTest.getCurrentItems().get(0).status);
//    holderUnderTest.markItemInProgress(holderUnderTest.getCurrentItems().get(0));
//    assertEquals(2,holderUnderTest.getCurrentItems().get(0).status);
//}
//
//  public void testwhen_addingItems_then_timeStampChanges(){
//    // setup
//    TodoItemsHolderImpl holderUnderTest = new TodoItemsHolderImpl();
//    assertEquals(1,TodoItem.timeStamp);
//    holderUnderTest.addNewInProgressItem("do_ex5");
//    assertEquals(1,holderUnderTest.getCurrentItems().get(0).createdTime);
//    holderUnderTest.addNewInProgressItem("do_ex2");
//    assertEquals(1,holderUnderTest.getCurrentItems().get(0).createdTime);
//    assertEquals(2,holderUnderTest.getCurrentItems().get(1).createdTime);
//  }
//  public void testwhen_addingNewTasks_then_orderIsCorrect(){
//    // setup
//    TodoItemsHolderImpl holderUnderTest = new TodoItemsHolderImpl();
//    holderUnderTest.addNewInProgressItem("do_ex5");
//    holderUnderTest.addNewInProgressItem("do_ex2");
//    holderUnderTest.addNewInProgressItem("do_ex2");
//    assertEquals(3,holderUnderTest.getCurrentItems().get(0).createdTime);
//    assertEquals(2,holderUnderTest.getCurrentItems().get(1).createdTime);
//    assertEquals(1,holderUnderTest.getCurrentItems().get(2).createdTime);
//  }
//
//  public void testwhen_changingStatus_then_orderIsCorrect(){
//    // setup
//    TodoItemsHolderImpl holderUnderTest = new TodoItemsHolderImpl();
//    holderUnderTest.addNewInProgressItem("do_ex1");
//    holderUnderTest.addNewInProgressItem("do_ex2");
//    holderUnderTest.addNewInProgressItem("do_ex3");
//    assertEquals("do_ex3",holderUnderTest.getCurrentItems().get(0).description);
//    assertEquals("do_ex2",holderUnderTest.getCurrentItems().get(1).description);
//    assertEquals("do_ex1",holderUnderTest.getCurrentItems().get(2).description);
//    holderUnderTest.markItemDone(holderUnderTest.itemsList.get(0));
//    assertEquals("do_ex2",holderUnderTest.getCurrentItems().get(0).description);
//    assertEquals("do_ex1",holderUnderTest.getCurrentItems().get(1).description);
//    assertEquals("do_ex3",holderUnderTest.getCurrentItems().get(2).description);
//  }
//
//}