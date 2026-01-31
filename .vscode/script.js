// Add event listener to the form submission
document.querySelector('form').addEventListener('submit', (e) => {
    e.preventDefault();
    // Call the login function here (e.g., using AJAX or a library like jQuery)
    console.log('Login form submitted!');
  });