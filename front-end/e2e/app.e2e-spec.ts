import { HarryLibPage } from './app.po';

describe('harry-lib App', () => {
  let page: HarryLibPage;

  beforeEach(() => {
    page = new HarryLibPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
